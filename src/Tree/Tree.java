package Tree;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
                String sql = ("SELECT * FROM bahasabaru");
                ResultSet rs = st.executeQuery(sql);
                int a = 0;
                while (rs.next()) {
                    Bahasa bahasa = new Bahasa();
                    bahasa.setIndo(rs.getString(1));
                    bahasa.setNgoko(rs.getString(2));
                    bahasa.setKromo(rs.getString(3));
                    insertNode(bahasa);
                    a++;
                }
                System.out.println(a);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Tree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void baca() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("DataJawa.csv"));
            while (br.readLine() != null) {

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tree.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
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
                    if (key.getKromo().charAt(0) > cari.getData().getKromo().charAt(0)) {
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
//
//    public void heightNode(int key) {
//        TreeNode cari = root;
//        int hitung = 1;
//        while (!isEmpty()) {
//            if (cari == null) {
//                break;
//            } else {
//                if (key == cari.getData()) {
//                    System.out.println("Height Node "
//                            + key + " adalah " + hitung);
//                    break;
//                } else {
//                    if (key > cari.getData()) {
//                        cari = cari.getRightNode();
//                        hitung++;
//                    } else {
//                        cari = cari.getLeftNode();
//                        hitung++;
//                    }
//                }
//            }
//        }
//    }
//
//    public void leafNode() {
//        postOrderLeaf(root);
//    }
//
//    private void postOrderLeaf(TreeNode node) {
//        if (node != null) {
//            postOrderLeaf(node.getLeftNode());
//            postOrderLeaf(node.getRightNode());
//            if (node.getLeftNode() == null && node.getRightNode() == null) {
//                System.out.print(node.getData() + " ");
//            }
//        }
//    }
//
//    public void descendant(int key) {
//        TreeNode node = descendantSearch(key);
//        preOrderHelper(node.getLeftNode());
//        preOrderHelper(node.getRightNode());
//    }
//
//    private TreeNode descendantSearch(int key) {
//        TreeNode cari = root;
//        while (!isEmpty()) {
//            if (cari == null) {
//                System.out.println("Data " + key + " Tidak Ada !");
//                break;
//            } else {
//                if (key == cari.getData()) {
//                    return cari;
//                } else {
//                    if (key > cari.getData()) {
//                        cari = cari.getRightNode();
//                    } else {
//                        cari = cari.getLeftNode();
//                    }
//                }
//            }
//        }
//        return null;
//    }

    public TreeNode searchNode(Bahasa key) {
        TreeNode cari = root;
        int a = 0;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key.getIndo().equalsIgnoreCase(cari.getData().getIndo())) {
                    System.out.println(cari.getData().getKromo());
                    return cari;
                } else {
                    if (key.getIndo().charAt(0) > cari.getData().getIndo().charAt(0)) {
                        System.out.println("cari kanan " + a);
                        cari = cari.getRightNode();
                        a++;
                    } else {
                        System.out.println("cari kiri " + a);
                        cari = cari.getLeftNode();
                        a++;
                    }
                }
            }
        }
        return null;
    }
//
//    public boolean delete(int key) {
//        TreeNode bantu = searchNode(key);
//        TreeNode parent = getCurrent(key);
//        if (bantu.getLeftNode() == null && bantu.getRightNode() == null) {
//            if (parent.getLeftNode() == bantu) {
//                parent.setLeftNode(null);
//                return true;
//            } else {
//                parent.setRightNode(null);
//                return true;
//            }
//        } else if (bantu.getLeftNode() == null
//                || bantu.getRightNode() == null) {
//            if (parent.getLeftNode() == bantu) {
//                if (bantu.getLeftNode() == null) {
//                    parent.setLeftNode(bantu.getRightNode());
//                    return true;
//                } else {
//                    parent.setLeftNode(bantu.getLeftNode());
//                    return true;
//                }
//            } else {
//                if (bantu.getLeftNode() == null) {
//                    parent.setRightNode(bantu.getRightNode());
//                    return true;
//                } else {
//                    parent.setRightNode(bantu.getLeftNode());
//                    return true;
//                }
//            }
//        } else {
//            if (key <= root.getData()) {
//                TreeNode predeccessor = getPredeccessor
//                (parent.getLeftNode());
//                bantu.setData(predeccessor.getData());
//                if (predeccessor.isLeaf()) {
//                    TreeNode cariKanan = bantu.getLeftNode();
//                    while (bantu.getRightNode() != null) {
//                        cariKanan = bantu;
//                        bantu = bantu.getRightNode();
//                    }
//                    cariKanan.setRightNode(null);
//                    return true;
//                } else {
//                    bantu.setData(bantu.getLeftNode().getData());
//                    bantu.setLeftNode(null);
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
//    
//    public TreeNode getPredeccessor(TreeNode del) {
//        TreeNode predeccessor = del;
//        while (predeccessor.getRightNode() != null) {
//            predeccessor = predeccessor.getRightNode();
//        }
//        return predeccessor;
//    }
//
//
//    public TreeNode getCurrent(int key) {
//        TreeNode cari = root;
//        TreeNode parent = root;
//        while (!isEmpty()) {
//            if (cari == null) {
//                break;
//            } else {
//                if (key == cari.getData()) {
//                    return parent;
//                } else {
//                    if (key > cari.getData()) {
//                        parent = cari;
//                        cari = cari.getRightNode();
//                    } else {
//                        parent = cari;
//                        cari = cari.getLeftNode();
//                    }
//                }
//            }
//        }
//        return null;
//    }

    public void preOrderTransversal() {
        preOrderHelper(root);
    }

    private void preOrderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData().getKromo() + " ");
            preOrderHelper(node.getLeftNode());
            preOrderHelper(node.getRightNode());
        }
    }

    public void inOrderTranversal() {
        inOrderHelper(root);
    }

    private void inOrderHelper(TreeNode node) {
        if (node != null) {
            inOrderHelper(node.getLeftNode());
            System.out.print(node.getData().getIndo() + " ");
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
            System.out.print(node.getData().getKromo() + " ");
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
