package view;
import stack.Pilha;
public class Principal {
	public static void main(String[]arg) throws Exception{
		
		int[] vetor = {14,24,38,15,5,39,11,25,22,20,17,1,26,5};
		
		
		Pilha pilhaOrg = new Pilha(vetor);
		Pilha pilhaPar = new Pilha(null);
		Pilha pilhaImpar = new Pilha(null);
		
		while (!pilhaOrg.isEmpty()) {
			int num = pilhaOrg.pop();
			if (num % 2 ==0) {
				pilhaPar.push(num);
			} else {
				pilhaImpar.push(num);
			}
		}
		
		
		System.out.println("n par topo: "+ pilhaPar.pop());
		System.out.println("n impar topo: "+ pilhaImpar.pop());
			
		
	}
}
