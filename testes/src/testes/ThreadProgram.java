package testes;

public class ThreadProgram implements Runnable {

	private int id;
	// colocar getter e setter pro atributo id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}
		while(id == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
