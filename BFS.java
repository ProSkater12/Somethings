
public class BFS {
		int vNum; // ���������� ������
	    boolean[][] graph; // ������� ���������
	    boolean[] used; // ������ ������r
	     
	void justBFS(int v) {
		         boolean[] used = new boolean [vNum]; // ������ �������
		         int[] queue = new int [vNum]; // �������
		         int qH = 0; // ������ �������
		         int qT = 0; // �����
		         
		         /* <��������� ������� v> */
		         used[v] = true; // �������� �������� �������
		         queue[qT++] = v; // �������� �� � ������� 
		         
		         while (qH < qT) { // ���� ������� �� �����
		             v = queue[qH++]; // ��������� ������� �������
		             for (int nv = 0; nv < vNum; nv++) { // ���������� �������
		                 if (!used[nv] && graph[v][nv]) { // ���� nv �� �������� � ������ � v
		                     /* <��������� ������� nv> */
		                     used[nv] = true; // �������� ��
		                     queue[qT++] = nv; // � ��������� � �������
		                 }
		             }
		         }
		     }

}
