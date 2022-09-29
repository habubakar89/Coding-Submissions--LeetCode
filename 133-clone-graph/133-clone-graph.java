/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Integer,Node> storeNode = new HashMap<Integer,Node>();
    public Node cloneGraph(Node node) {
        //Return the node itself if it is null
        if(node == null) return node;
        //Check if the hashmap already contains the given value
        while(!storeNode.containsKey(node.val)){
            //Make a new node out of the original node
            Node temp = new Node(node.val);
            //Store the new node in the HashMap
            storeNode.put(temp.val, temp);
            //Now go for the neighbours of the given node
            for(Node itr : node.neighbors){
                Node copyItr = cloneGraph(itr);
                //Add the neighbour to the new node's neighbours if it is not null
                // if(copyItr != null){
                    temp.neighbors.add(copyItr);
                // }
            }
            
        }
        //Return the copy of the original node
        return storeNode.get(node.val);
    }
}