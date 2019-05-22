package Tree;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tree {

    private TreeNode root;
    private int size = 1;

    public Tree() {
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void bacaData() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sdnl", "root", "")) {
                Statement st = (Statement) con.createStatement();
                String sql = ("SELECT * FROM bahasabarubanget");
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    Bahasa bahasa = new Bahasa();
                    bahasa.setIndo(rs.getString(4));
                    bahasa.setNgoko(rs.getString(1));
                    bahasa.setKrama(rs.getString(2));
                    bahasa.setKramaInggil(rs.getString(3));
                    insertNode(bahasa);
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Tree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertNode(Bahasa key) {
        TreeNode node = new TreeNode(key);
        if (root == null) {
            root = node;
        } else {
            getRoot().insert(key);
            size++;
        }
    }

    public TreeNode searchNode(Bahasa key) {
        TreeNode cari = root;
        int a = 0;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key.getIndo().equalsIgnoreCase(cari.getData().getIndo())) {
                    return cari;
                } else {
                    if (key.getIndo().charAt(0) > cari.getData().getIndo().charAt(0)) {
                        cari = cari.getRightNode();
                        a++;
                    } else {
                        cari = cari.getLeftNode();
                        a++;
                    }
                }
            }
        }
        return null;
    }

    public void depthNode(Bahasa key) {
        TreeNode cari = root;
        int hitung = 0;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key == cari.getData()) {
                    System.out.println("Dept Node "
                            + key + " adalah " + hitung);
                    break;
                } else {
                    if (key.getKrama().charAt(0) > cari.getData().getKrama().charAt(0)) {
                        cari = cari.getRightNode();
                        hitung++;
                    } else {
                        cari = cari.getLeftNode();
                        hitung++;
                    }
                }
            }
        }
    }

    public void heightNode(Bahasa key) {
        TreeNode cari = root;
        int hitung = 1;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key.getIndo().equalsIgnoreCase(cari.getData().getIndo())) {
                    System.out.println("Height Node "
                            + key + " adalah " + hitung);
                    break;
                } else {
                    if (key.getIndo().charAt(0) > cari.getData().getIndo().charAt(0)) {
                        cari = cari.getRightNode();
                        hitung++;
                    } else {
                        cari = cari.getLeftNode();
                        hitung++;
                    }
                }
            }
        }
    }

    public void leafNode() {
        postOrderLeaf(root);
    }

    private void postOrderLeaf(TreeNode node) {
        if (node != null) {
            postOrderLeaf(node.getLeftNode());
            postOrderLeaf(node.getRightNode());
            if (node.getLeftNode() == null && node.getRightNode() == null) {
                System.out.print(node.getData() + " ");
            }
        }
    }

    public void descendant(Bahasa key) {
        TreeNode node = descendantSearch(key);
        preOrderHelper(node.getLeftNode());
        preOrderHelper(node.getRightNode());
    }

    private TreeNode descendantSearch(Bahasa key) {
        TreeNode cari = root;
        while (!isEmpty()) {
            if (cari == null) {
                System.out.println("Data " + key + " Tidak Ada !");
                break;
            } else {
                if (key.getIndo().equalsIgnoreCase(cari.getData().getIndo())) {
                    return cari;
                } else {
                    if (key.getIndo().charAt(0) > cari.getData().getIndo().charAt(0)) {
                        cari = cari.getRightNode();
                    } else {
                        cari = cari.getLeftNode();
                    }
                }
            }
        }
        return null;
    }

    public boolean delete(Bahasa key) {
        TreeNode bantu = searchNode(key);
        TreeNode parent = getCurrent(key);
        if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
            if (parent.getLeftNode() == bantu) {
                parent.setLeftNode(null);
                return true;
            } else {
                parent.setRightNode(null);
                return true;
            }
        } else if (bantu.getLeftNode() == null
                || bantu.getRightNode() == null) {
            if (parent.getLeftNode() == bantu) {
                if (bantu.getLeftNode() == null) {
                    parent.setLeftNode(bantu.getRightNode());
                    return true;
                } else {
                    parent.setLeftNode(bantu.getLeftNode());
                    return true;
                }
            } else {
                if (bantu.getLeftNode() == null) {
                    parent.setRightNode(bantu.getRightNode());
                    return true;
                } else {
                    parent.setRightNode(bantu.getLeftNode());
                    return true;
                }
            }
        } else {
            if (key.getIndo().charAt(0) > root.getData().getIndo().charAt(0)) {
                TreeNode predeccessor = getPredeccessor(parent.getLeftNode());
                bantu.setData(predeccessor.getData());
                if (predeccessor.isLeaf()) {
                    TreeNode cariKanan = bantu.getLeftNode();
                    while (bantu.getRightNode() != null) {
                        cariKanan = bantu;
                        bantu = bantu.getRightNode();
                    }
                    cariKanan.setRightNode(null);
                    return true;
                } else {
                    bantu.setData(bantu.getLeftNode().getData());
                    bantu.setLeftNode(null);
                    return true;
                }
            }
            return false;
        }
    }

    public TreeNode getPredeccessor(TreeNode del) {
        TreeNode predeccessor = del;
        while (predeccessor.getRightNode() != null) {
            predeccessor = predeccessor.getRightNode();
        }
        return predeccessor;
    }

    public TreeNode getCurrent(Bahasa key) {
        TreeNode cari = root;
        TreeNode parent = root;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key.getIndo().equalsIgnoreCase(cari.getData().getIndo())) {
                    return parent;
                } else {
                    if (key.getIndo().charAt(0) > cari.getData().getIndo().charAt(0)) {
                        parent = cari;
                        cari = cari.getRightNode();
                    } else {
                        parent = cari;
                        cari = cari.getLeftNode();
                    }
                }
            }
        }
        return null;
    }

    public void preOrderTransversal() {
        preOrderHelper(root);
    }

    private void preOrderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData().getKrama() + " ");
            preOrderHelper(node.getLeftNode());
            preOrderHelper(node.getRightNode());
        }
    }

    public void inOrderTranversal() {
        System.out.println("Indonesia\tNgoko\tKrama\tKrama Inggil\n");
        inOrderHelpera(root);
    }
    String d = "";

    public String inOrderHelpera(TreeNode node) {

        if (node != null) {
            inOrderHelpera(node.getLeftNode());
            d = d + node.getData().getIndo() + "\t" + node.getData().getNgoko() + "\t"
                    + node.getData().getKrama() + "\t" + node.getData().getKramaInggil() + "\t\n";
            inOrderHelpera(node.getRightNode());
        } else {
            return d;
        }
        return d;
    }

    private void inOrderHelper(TreeNode node) {
        if (node != null) {
            inOrderHelper(node.getLeftNode());
            System.out.println(node.getData().getIndo() + "\t" + node.getData().getNgoko() + "\t"
                    + node.getData().getKrama() + "\t" + node.getData().getKramaInggil() + "\t");
            inOrderHelper(node.getRightNode());
        }
    }

    public void postOrderTransversal() {
        postOrderHelper(root);
    }

    private void postOrderHelper(TreeNode node) {
        if (node != null) {
            postOrderHelper(node.getLeftNode());
            postOrderHelper(node.getRightNode());
            System.out.print(node.getData().getKrama() + " ");
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
