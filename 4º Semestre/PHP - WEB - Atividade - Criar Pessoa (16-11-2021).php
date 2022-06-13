<?php

class Pessoa {
	
    protected $nome;
    protected $dataNasc;
	
    public function __construct($n, $d){
        $this->nome = $n;
        $this->dataNasc = $d;
    }
	
	public function setDataNasc($d){
        $this->dataNasc = $d;
    }
    public function getDataNasc(){
        return $this->dataNasc;
    }
	
	public function setNome($n){
        $this->nome = $n;
    }
    public function getNome(){
        return $this->nome;
    }
    
}

?>