package List_5;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;
public class List_5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	      
	     int i,j;
	     
	     ArrayList<String> redesocial = new ArrayList();

	    // [ B ] usando o m�todo add() para gravar 4 contatos na agenda
	    
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Inserir\n2-Excluir\n3-Pesquisar\n4-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                String telefone= JOptionPane.showInputDialog("Digite o telefone: ");
	                String instagram= JOptionPane.showInputDialog("Digite o seu Instagram: ");
	                String email= JOptionPane.showInputDialog("Digite o seu e-mail: ");
	                redesocial.add(nome+";"+telefone+";"+instagram+";"+email);
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                 
	              break;
	            
	             case 2:
	                 String buscar= JOptionPane.showInputDialog("Digite alguma informa��o: ");
	                 int n = redesocial.size();
	               try {
	                	for(int k = 0; k<n ; k++)
	                	{
	                		if(redesocial.get(k).contains(buscar))
	                		{
	                			redesocial.remove(k);
	                			JOptionPane.showMessageDialog(null, "Exclu�do com sucesso!");
	                		}
	                		
	                		else if (!redesocial.get(k).contains(buscar)&& k==n-1) 
	                		JOptionPane.showMessageDialog(null, "N�o foi poss�vel encontrar o registro!");

	                	}
	               }  catch (IndexOutOfBoundsException e) {
	                      // exce��o lan�ada para indicar que um �ndice (i)
	                      // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
	                      System.out.printf("\nErro: posi��o inv�lida (%s).",
	                        e.getMessage());
	               }
	               break;
	                 
	                
	               	             
	             case 3:
	            	 String buscanome= JOptionPane.showInputDialog("Digite o Nome: ");
	            	 try {
			                int w = redesocial.size();
			                for(i=0;i<w;i++) {
			                	if(redesocial.get(i).contains(buscanome)) 
			                	{
			                		JOptionPane.showInternalMessageDialog(null, redesocial.get(i));
			                		
			                	}
			                	else if(!redesocial.get(i).contains(buscanome) && i==w-1){
			                		JOptionPane.showInternalMessageDialog(null, "\nErro: Nome invalido (%s).");
			                	}
			                }
	            	 } catch (IndexOutOfBoundsException e) {
	                      // exce��o lan�ada para indicar que um �ndice (i)
	                      // est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
	                      System.out.printf("\nErro: posi��o inv�lida (%s).",
	                        e.getMessage());
	                  }
	                 break;
	             
	             case 4:
	 
	                  break;
	             
	        }
	     } while (i!=4);
	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
