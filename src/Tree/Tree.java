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
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | SQLException ex) {
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
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key.getIndo().equalsIgnoreCase(cari.getData().getIndo())) {
                    return cari;
                } else {
                    if (key.getIndo().charAt(0)
                            > cari.getData().getIndo().charAt(0)) {
                        cari = cari.getRightNode();
                    } else {
                        cari = cari.getLeftNode();
                    }
                }
            }
        }
        return null;
    }
    public TreeNode searchNode(String key) {
        TreeNode cari = root;
        while (!isEmpty()) {
            if (cari == null) {
                break;
            } else {
                if (key.equalsIgnoreCase(cari.getData().getIndo())) {
                    return cari;
                } else {
                    if (key.charAt(0)
                            > cari.getData().getIndo().charAt(0)) {
                        cari = cari.getRightNode();
                    } else {
                        cari = cari.getLeftNode();
                    }
                }
            }
        }
        return null;
    }
    public static String inorder = "";

    public String inOrderHelpera(TreeNode node) {
        if (node != null) {
            inOrderHelpera(node.getLeftNode());
            inorder = inorder + node.getData().getIndo()
                    + "\t" + node.getData().getNgoko() + "\t"
                    + node.getData().getKrama() + "\t"
                    + node.getData().getKramaInggil() + "\n";
            inOrderHelpera(node.getRightNode());
        }
        return inorder;
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
