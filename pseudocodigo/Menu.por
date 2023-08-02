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
	            escreva("Cliente ou destino não cadastrado, escolha opção 1 para cadastramento \n\n")
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
	        
	        escreva("Opção inválida, volte ao menu e escolha opções de 1 a 3 \n\n")
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
	        escreva("Usuário cadastrado com sucesso! \n")
		 retorne retornoCadastro
		 
		}
		
funcao cadeia cadastroDestino(){
    		    cadeia pais,cidade, preco
		    
		    cadeia cadastro[] = {"País: ", "Cidade: ", "Preço: "}
		    cadeia vetor[3] 
		    cadeia retornoCadastro = ""
		    
        escreva("Digite o país de destino: ")
        leia(vetor[0])
        escreva("Digite a cidade de destino: ")
        leia(vetor[1])
        escreva("Digite o preço: R$ ")
        leia(vetor[2])
        
		    para(inteiro i = 0; i < 3; i++){
		      retornoCadastro += cadastro[i] + vetor[i] + "\n"
	    }
	    
	    escreva("Destino cadastrado com sucesso!")
	    retorne retornoCadastro
		 
		}
		
		
		funcao opcaoMenu(){
		     
	    
	    escreva("===== Menu Vá longe sua agência de viagem ===== \n")
	    escreva("1 para cadastrar cliente e destino \n")
	    escreva("2 para consulta\n")
	    escreva("3 para sair do menu \n")
	    
        
		}
		
	        
    
}		
	
