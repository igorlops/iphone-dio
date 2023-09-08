import java.util.Scanner;

import iphone.Iphone;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos usar o iphone");
		System.out.println("1 - Telefone \n 2 - Menu Web \n 3 - Menu Musica \n 4 - Sair");
		int decisao = scan.nextInt();
		scan.nextLine();
		while(decisao!=4) {
			if(decisao==1) {
				System.out.println("Escolha as opções para essa para o menu telefônico!");
				System.out.println("1 - Ligar \n 2 - Atender \n 3 - Correio de voz \n 4 - Sair");
				int telefone = scan.nextInt();
				while(telefone!=4) {
					scan.nextLine();
					if(telefone==1) {
						new Iphone().call();
					}else if(telefone==2) {
						new Iphone().answer();
					}else if(telefone==3) {
						new Iphone().voiceMail();
					}
					System.out.println("1 - Ligar \n 2 - Atender \n 3 - Correio de voz \n 4 - Sair");
					telefone = scan.nextInt();
				}
			}
			
			else if(decisao==2) {
				System.out.println("Escolha as opções para navegador web");
				System.out.println("1 - Exibir página \n 2 - Adicionar nova aba \n 3 - Atualizar página \n 4 - Sair");
				int navegador = scan.nextInt();
				scan.nextLine();
				while(navegador!=4) {
					scan.nextLine();
					if(navegador==1) {
						new Iphone().exibirPag();
					}else if(navegador==2) {
						new Iphone().adicionarNAba();
					}else if(navegador==3) {
						new Iphone().attPagina();
					}
					System.out.println("1 - Exibir página \n 2 - Adicionar nova aba \n 3 - Atualizar página \n 4 - Sair");
					navegador = scan.nextInt();
				}
		}
			else if(decisao==3) {
				System.out.println("Escolha as opções para reprodutor musical!");
				System.out.println("1 - Tocar música \n 2 - Pausar música \n 3 - Selecionar música \n 4 - Sair");
				int musica = scan.nextInt();
				while(musica!=4) {
					scan.nextLine();
					if(musica==1) {
						new Iphone().playMusic();
					}else if(musica==2) {
						new Iphone().pauseMusic();
					}else if(musica==3) {
						new Iphone().selectMusic();
					}
					System.out.println("1 - Tocar música \n 2 - Pausar música \n 3 - Selecionar música \n 4 - Sair");
					musica = scan.nextInt();
					
				}
			}
			System.out.println("1 - Telefone \n 2 - Menu Web \n 3 - Menu Musica \n 4 - Sair");
			decisao = scan.nextInt();
			scan.nextLine();
		}
		System.out.println("Encerrando programa... até a próxima!");
	}
}
