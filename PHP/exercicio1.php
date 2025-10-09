<?php
    /*  Escreva um script que leia o nome de uma peça de roupa e o tamanho (P, M ou G). 
    Use switch para definir o preço base e if para aplicar um acréscimo de 10% se for tamanho G. 
    Mostre o preço final concatenando uma frase descritiva.*/


    // Dados da peça
    $peca = "camiseta";
    $tamanho = "L";

    // Preço base
    switch ($peca) {
        case 'camiseta':
            $preco = 50;
            break;
        case 'calça':
            $preco = 80;
            break;
        case 'jaqueta':
            $preco = 150;
            break;
        default:
            $preco = 100;
            break;
    }

    // Condicional para aplicar acréscimo de 10% no tamanho G
    if ($tamanho == 'G') {
        $preco = $preco + ($preco * 0.10);
    } elseif ($tamanho == 'P' || $tamanho == 'M') {
        $preco = $preco; // Sem aumento pra P ou M
    } else {
        echo "Tamanho inválido! Use P, M ou G."; // quando digitar algo diferente
        exit;
    }

    // Resultado preço final
    echo "A peça " . $peca . " tamanho " . $tamanho . " custa R$ " . $preco;
?>