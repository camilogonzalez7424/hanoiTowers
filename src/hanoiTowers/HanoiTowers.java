package hanoiTowers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTowers {
	public static final int TOWER_AMOUNT = 3; 
	public static final int ORIGIN = 0;
	public static final int AUXILIAR = 1;
	public static final int DESTINY = 2;

	private int[] towers;
	private int disks;
	
	public HanoiTowers(int k){
		towers = new int[TOWER_AMOUNT];
		disks = k;
		towers[ORIGIN] = k;
		towers[AUXILIAR] = 0;
		towers[DESTINY] = 0;
	}
	
	//first call
	public void hanoi() {
		System.out.println(towers[ORIGIN]+" "+towers[AUXILIAR]+" "+towers[DESTINY]);
		hanoi(disks,ORIGIN,DESTINY,AUXILIAR);
	}
	
	public void hanoi(int k, int origin, int destiny, int aux) {
		if(k>0) {
			hanoi(k-1,origin,aux,destiny);
			moveDisks(origin, destiny);
			System.out.println(towers[ORIGIN]+" "+towers[AUXILIAR]+" "+towers[DESTINY]);
			hanoi(k-1,aux,destiny,origin);
			
			}
		}
	
	public void moveDisks(int origin, int destiny) {
		towers[origin] = towers[origin]-1;
		towers[destiny] = towers[destiny]+1;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		
		while(m!=0) {
			
		int out = Integer.parseInt(br.readLine());
		HanoiTowers newHanoi = new HanoiTowers(out);
		newHanoi.hanoi();
		System.out.println("");
		m--;
		}
		
		br.close();
	}
	
	
	

}
