
public class BFS {
		int vNum; // количество вершин
	    boolean[][] graph; // матрица смежности
	    boolean[] used; // массив пометоr
	     
	void justBFS(int v) {
		         boolean[] used = new boolean [vNum]; // массив пометок
		         int[] queue = new int [vNum]; // очередь
		         int qH = 0; // голова очереди
		         int qT = 0; // хвост
		         
		         /* <обработка вершины v> */
		         used[v] = true; // помечаем исходную вершину
		         queue[qT++] = v; // помещаем ее в очередь 
		         
		         while (qH < qT) { // пока очередь не пуста
		             v = queue[qH++]; // извлекаем текущую вершину
		             for (int nv = 0; nv < vNum; nv++) { // перебираем вершины
		                 if (!used[nv] && graph[v][nv]) { // если nv не помечена и смежна с v
		                     /* <обработка вершины nv> */
		                     used[nv] = true; // помечаем ее
		                     queue[qT++] = nv; // и добавляем в очередь
		                 }
		             }
		         }
		     }

}
