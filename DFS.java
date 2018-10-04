
public class DFS {
	int vNum; // количество вершин
    int eNum; // количество ребер
    boolean[][] graph; // матрица смежности
    boolean[] used; // массив пометок
 
    void justDFS(int v) {
        used[v] = true; // помечаем вершину
        for (int nv = 0; nv < vNum; nv++) // перебираем вершины
            if (!used[nv] && graph[v][nv]) // если вершина не помечена, и смежна с текущей
                justDFS(nv); // рекурсивно запускаем от нее DFS
    }

}
