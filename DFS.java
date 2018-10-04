
public class DFS {
	int vNum; // ���������� ������
    int eNum; // ���������� �����
    boolean[][] graph; // ������� ���������
    boolean[] used; // ������ �������
 
    void justDFS(int v) {
        used[v] = true; // �������� �������
        for (int nv = 0; nv < vNum; nv++) // ���������� �������
            if (!used[nv] && graph[v][nv]) // ���� ������� �� ��������, � ������ � �������
                justDFS(nv); // ���������� ��������� �� ��� DFS
    }

}
