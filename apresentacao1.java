public NoBinario removeChildren(NoBinario no) { //Crio um método do tipo NoBinario chamado de removeChildren passando como argumento um objeto do tipo NoBinario e o chamei de nó
        if (no == null) {
            return no; //Nesse if verifico se o nó é nullo, caso o seja retorno ele mesmo pois não há mais referência em memória.
        }

        if (no.getEsquerda() == null && no.getDireita() == null) {
            return no = null; //Nesse if verifico se o nó recebido no argumento do método é uma sub-árvore, caso o seja apago sua referência e retorno o valor null da referência para a chamada recursiva
        } else {
            removeChildren(no.getEsquerda()); // Chamada Recursiva do método para excluir o nó/sub-árvore à esquerda
            if (no.getEsquerda() == null) {
                no.setEsquerda(null); //Caso o retorno da chamada recursiva seja seja null, ou seja apagou a referência da sub-árvore e por fim setto valor da sub-árvore como null
                return no.getEsquerda(); //E por fim retorno o valor nulo da referência em memória.
            }

            removeChildren(no.getDireita());// Chamada Recursiva do método para excluir o nó/sub-árvore à direita
            if (no.getDireita() == null) {
                no.setDireita(null); //Caso o retorno da chamada recursiva seja seja null, ou seja apagou a referência da sub-árvore e por fim setto valor da sub-árvore como null
                return no.getDireita(); //E por fim retorno o valor nulo da referência em memória.
            }
            return no = null; //retorno o último nó após apagar os filhos, com isso a raíz/pai é apagada.
        }
    }