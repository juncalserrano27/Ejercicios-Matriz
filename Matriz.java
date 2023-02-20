
public class Matriz {
	public void MultiplicaMatrices(int [][]A, int [][]B) {
		int columnas1=A[0].length;
		int filas1=A.length;
		int columnas2=B[0].length;
		int filas2=B.length;
		
		int[][] r= new int [columnas2][filas2];
		if (columnas1==filas2) {
			int res = 0;
			int j;
			for(int i=0; i<columnas2-1;i++) {
				for(j=0;j<filas1-1;j++) {
					for(int a=0;a<columnas1;a++)
					res=res+(A[j][a]*B[a][i]);}
					r[j][i]=res;
			}System.out.println("Imprimiendo producto\n");
	        for (int i = 0; i < filas2; i++) {
	            for ( j = 0; j < columnas2; j++) {
	            	System.out.printf("%5d ",r[j][i]);
	            }System.out.println();
	            
		}
	        }
		
		
	}
	public void transponerMatriz(int[][] matriz){
		int[][] transpuesta=new int[matriz[0].length][matriz.length];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                transpuesta[j][i] = matriz[i][j];
            }}
            for (int i = 0; i < matriz[0].length; i++) {
            for ( int j = 0; j < matriz.length; j++) {
            	System.out.printf("%5d ",transpuesta[i][j]);
               
    }System.out.println();
    }}
	public int sumarDiagonal(int[][] matriz) {
            int suma = 0;
            int x = 0, y = 0;
            while (x < matriz.length && y < matriz[0].length) {
                suma += matriz[y][x];
                x++;
                y++;
            }return suma;
	}
	public int numeroMayor(int [][]matriz) {
		int numeroMayor=matriz[0][0];
		for (int x=0;x<matriz.length;x++) {
			  for (int y=0;y<matriz[x].length;y++) {
			    if (matriz[x][y] > numeroMayor) {
			      numeroMayor = matriz[x][y];
			      
			    }
	}
	}return numeroMayor;
	}
	public void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                int numeroMatriz1 = matriz1[y][x];
                int numeroMatriz2 = matriz2[y][x];
                matrizSuma[y][x]= numeroMatriz1 + numeroMatriz2;
            }
            for (int x = 0; x < matrizSuma[y].length; x++) {
                System.out.printf("%5d ",matrizSuma[y][x]);
            }
            System.out.println(); }

           
        }
	public void multiplicarEscalar(int[][] pMatriz, int escalar){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] *= escalar;
            }for (int x = 0; x < pMatriz[i].length; x++) {
                System.out.printf("%5d ",pMatriz[i][x]);
        } System.out.println(); }
        }
        
}

	

	


