package CloneGraph;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 给你无向 连通 图中一个节点的引用，请你返回该图的 深拷贝（克隆）。。。
 */
public class Solution {
    private HashMap<Node,Node> map = new HashMap<>();
    public Node cloneGraph(Node node){
        if(node == null){
            return node;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node cloneNode = new Node(node.val, new ArrayList<Node>());
        map.put(node,cloneNode);
        for(Node neighbor:node.neighbors){
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }
    return cloneNode;
    }
}
