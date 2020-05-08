package entities;

public class Games {
	private String name;
	private int code;
	private float costPerUnity;

	public Games(String name, int code, float costPerUnity) {
		this.name = name;
		this.code = code;
		this.costPerUnity = costPerUnity;
	}

	public String toString() {
		return "Nome: " + name + ", Codigo : " + code + ", Custo por unidade : " + costPerUnity;
	}

	public int getCode() {
		return code;
	}

	public void verifica(int resp, Games vectorgame[]) {
		for (int i = 0; i < vectorgame.length; i++) {
			if(resp==vectorgame[i].getCode()) {
				
			}
		}
			
	}
	

}
