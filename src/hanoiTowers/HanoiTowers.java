package hanoiTowers;

public class HanoiTowers {
	public static final int TOWER_AMOUNT = 3; 
	public static final int ORIGIN = 0;
	public static final int AUXILIAR = 0;
	public static final int DESTINY = 0;

	private int[] towers;
	private int disks;
	
	public HanoiTowers(int k){
		towers = new int[TOWER_AMOUNT];
		disks = k;
		towers[ORIGIN] = k;
	}
	
	//first call
	public void hanoi() {
		hanoi(disks,ORIGIN,AUXILIAR,DESTINY);
	}
	
	public void hanoi(int k, int origin, int destiny, int aux) {
		if(k>0) {
			hanoi(k-1,origin,aux,destiny);
				
			}
		}
	
	
	public static void main(String[] args) {
		System.out.println("Start Algorithm");
	}
	
	
	

}
