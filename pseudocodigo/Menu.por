programa {
	funcao inicio() {
	    
	    cadeia resCliente = ""
	    cadeia resDestino = ""
	    inteiro contador = 1
	    
	    
	    enquanto(contador == 1){
	        
	        inteiro opcao
	            opcaoMenu()
	             leia(opcao)
	             
	        se(opcao == 1){
	        resCliente = cadastroCliente()
	        resDestino = cadastroDestino()
	 
	    }senao se(opcao == 2){
	        se(resCliente == "" ou resDestino == ""){
	            escreva("Cliente ou destino n�o cadastrado, escolha op��o 1 para cadastramento \n\n")
	        }senao{
	            escreva("===== Cliente ===== \n \n")
	            escreva(resCliente, "\n")
	            escreva("===== Destino ===== \n\n")
	            escreva(resDestino, "\n")
	        }
	      
	    }senao se(opcao == 3){
	        escreva("Obrigado e volte sempre!")
	        contador++
	    }senao{
	        
	        escreva("Op��o inv�lida, volte ao menu e escolha op��es de 1 a 3 \n\n")
	    }
	    
	    }
	  
}

funcao cadeia cadastroCliente(){
    
		    cadeia nome, email,telefone, idade
		    
		    cadeia cadastro[] = {"Nome: ", "Email: ", "Telefone: ", "Idade: "}
		    cadeia vetor[4] 
		    cadeia retornoCadastro = ""
		    
        escreva("Digite seu nome: ")
        leia(vetor[0])
        escreva("Digite seu email: ")
        leia(vetor[1])
        escreva("Digite seu telefone: ")
        leia(vetor[2])
        escreva("Digite sua idade: ")
        leia(vetor[3])
        
    
		    para(inteiro i = 0; i < 4; i++){
		      retornoCadastro += cadastro[i] + vetor[i] + "\n"
		      
	        }
	        escreva("Usu�rio cadastrado com sucesso! \n")
		 retorne retornoCadastro
		 
		}
		
funcao cadeia cadastroDestino(){
    		    cadeia pais,cidade, preco
		    
		    cadeia cadastro[] = {"Pa�s: ", "Cidade: ", "Pre�o: "}
		    cadeia vetor[3] 
		    cadeia retornoCadastro = ""
		    
        escreva("Digite o pa�s de destino: ")
        leia(vetor[0])
        escreva("Digite a cidade de destino: ")
        leia(vetor[1])
        escreva("Digite o pre�o: R$ ")
        leia(vetor[2])
        
		    para(inteiro i = 0; i < 3; i++){
		      retornoCadastro += cadastro[i] + vetor[i] + "\n"
	    }
	    
	    escreva("Destino cadastrado com sucesso!")
	    retorne retornoCadastro
		 
		}
		
		
		funcao opcaoMenu(){
		     
	    
	    escreva("===== Menu V� longe sua ag�ncia de viagem ===== \n")
	    escreva("1 para cadastrar cliente e destino \n")
	    escreva("2 para consulta\n")
	    escreva("3 para sair do menu \n")
	    
        
		}
		
	        
    
}		
	
