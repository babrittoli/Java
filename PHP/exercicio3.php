<?php

    /*Some todos os números pares entre 1 e 50 com while e 
    armazene os pares em um array. Mostre a soma final e a lista de pares.*/

    $numero = 0;
    $pares = [];
    $soma = 0;

    while ($numero <= 50) {
        if ($numero % 2 == 0) {
            array_push($pares, $numero);
            $soma += $numero;
        }
        $numero++;
    }

    echo "Soma: $soma\n";
    echo "Pares: ";
    print_r($pares);
?>