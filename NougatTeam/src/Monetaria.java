/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo Nougat
 */
public class Monetaria {

	private int Num;
	private int[] iNum;
	private char[] cNum;
	private String[] sNum;
	private String u,d,c,um,dm,cm,uM,dM,cM;
	
	

	public void setValornumerico(int valornumerico) {
		this.Num = valornumerico;
	}
	
	public void Inicio(){
		ConvertirACadena();
	}
	
	private void ConvertirACadena(){
		String sNumero = String.valueOf(this.Num);
		cNum = new char[sNumero.length()];
		for (int i = 0; i < cNum.length; i++) {
			cNum[i] = sNumero.charAt(i);
		}
		iNum = new int[cNum.length];
		for(int j = iNum.length, k = 0; j > 0; j--,k++){
			iNum[k] = Integer.parseInt(String.valueOf(cNum[k]));
			System.out.println(iNum[k]);
		}
	}
	
	private void CadenaChar(){
		String sNumero = String.valueOf(Num);
		cNum = new char[sNumero.length()];
		for (int i = 0; i < cNum.length; i++) {
			cNum[i] = sNumero.charAt(i);
		}
	}
	
}

