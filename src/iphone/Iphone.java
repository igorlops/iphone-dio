package iphone;

public class Iphone {
	private Ipod ipod;
	private Navegador navegador;
	private Telefone telefone;
	
	
	public Iphone() {
		this.navegador = new Navegador();
		this.ipod = new Ipod();
		this.telefone = new Telefone();
	}
	
    public void exibirPag(){
        System.out.println(this.navegador.exibePagina());
    }
    public void adicionarNAba(){
    	System.out.println(this.navegador.abrindoNovaAba());
    }
    public void attPagina(){
    	 System.out.println(this.navegador.atualizandoPagina());
    }
    public void call(){
    	 System.out.println(this.telefone.ligar());
    }
    public void answer(){
    	 System.out.println(this.telefone.atender());
    }
    public void voiceMail(){
    	 System.out.println(this.telefone.correioDeVoz());
    
    }
    public void playMusic(){
    	 System.out.println(this.ipod.tocar());
    }
    public void pauseMusic(){
    	 System.out.println(this.ipod.pausaMusica());
    }
    public void selectMusic(){
    	 System.out.println(this.ipod.selecionaMusica());
    }
}
