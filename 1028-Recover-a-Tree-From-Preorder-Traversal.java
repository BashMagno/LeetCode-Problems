/*
We run a preorder depth-first search (DFS) on the root of a binary tree.

At each node in this traversal, we output D dashes (where D is the depth of this node), then we output the value of this node.  If the depth of a node is D, the depth of its immediate child is D + 1.  The depth of the root node is 0.

If a node has only one child, that child is guaranteed to be the left child.

Given the output traversal of this traversal, recover the tree and return its root.

 

Example 1:


Input: traversal = "1-2--3--4-5--6--7"
Output: [1,2,5,3,4,6,7]
Example 2:


Input: traversal = "1-2--3---4-5--6---7"
Output: [1,2,5,3,null,6,null,4,null,7]
Example 3:


Input: traversal = "1-401--349---90--88"
Output: [1,401,null,349,88,90]
 

Constraints:

The number of nodes in the original tree is in the range [1, 1000].
1 <= Node.val <= 109
*/
//RUNTIME
/*
Runtime
      Details
      6ms
      Beats 53.57%of users with Java
Memory
      Details
      43.39MB
      Beats 77.55%of users with Java
*/
// Definimos la clase TreeNode que representa un nodo de un árbol binario
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        // Usamos una pila (stack) para llevar un seguimiento de los nodos
        Deque<TreeNode> stack = new LinkedList<>();
        
        int i = 0; // Inicializamos el índice de iteración
        int n = traversal.length(); // Obtenemos la longitud de la cadena de recorrido
        
        // Iteramos a través de la cadena de recorrido
        while (i < n) {
            int level = 0;
            // Encontramos el nivel de profundidad del nodo actual
            while (traversal.charAt(i) == '-') {
                level++;
                i++;
            }
            
            int value = 0;
            // Encontramos el valor del nodo actual
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                value = value * 10 + Character.getNumericValue(traversal.charAt(i));
                i++;
            }
            
            TreeNode node = new TreeNode(value); // Creamos un nuevo nodo
            
            // Desapilamos los nodos hasta el nivel correcto
            while (level < stack.size()) {
                stack.pop();
            }
            
            // Conectamos el nodo actual como hijo de su nodo padre
            if (!stack.isEmpty()) {
                if (stack.peek().left == null) {
                    stack.peek().left = node;
                } else {
                    stack.peek().right = node;
                }
            }
            
            stack.push(node); // Apilamos el nodo actual
        }
        
        return stack.peekLast(); // Devolvemos el último nodo apilado (la raíz)
    }
}
