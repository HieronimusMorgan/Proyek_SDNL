package Tree;

public class TreeNode {

    private Bahasa data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode() {
    }

    public TreeNode(Bahasa data) {
        this.data = data;
    }

    public void insert(Bahasa key) {
        if (key.getIndo().charAt(0) > getData().getIndo().charAt(0)) {
            if (getRightNode() == null) {
                setRightNode(new TreeNode(key));
            } else {
                getRightNode().insert(key);
            }
        } else {
            if (getLeftNode() == null) {
                setLeftNode(new TreeNode(key));
            } else {
                getLeftNode().insert(key);
            }
        }
    }

    public Bahasa getData() {
        return data;
    }

    public void setData(Bahasa data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public boolean isLeaf() {
        return leftNode == null && rightNode == null;
    }
}
