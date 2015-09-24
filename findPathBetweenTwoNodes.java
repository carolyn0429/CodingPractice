/** 
* use DFS to find a path from a to b 
* @param a the starting node 
* @param b the ending node 
* @param c the current node 
* @return a string with the list of nodes to b 
*/ 
String DFS(node a, node b, node c) { 
if(c == b) { 
return this.toString(); // assume toString can uniquely identify this node somehow 
} // end if c == b 
for(int i = 0; i < c.numNodes; i++) { 
String out = DFS(a,b,c.node[i]); 
if(out.length() > 0) return out + this.toString(); 
} // end for i 
}