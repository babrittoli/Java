<?php

    /* Faça um simulador de caixa eletrônico: escolha a opção 
    de saque (20, 50, 100) com switch e while para contar notas.*/ 
    $opcao = 3;

    switch ($opcao) {
        case 1:
            $valor = 20;
            break;
        case 2:
            $valor = 50;
            break;
        case 3:
            $valor = 100;
            break;
    }

    echo "Saque: R$ $valor\n\n";

    $notas50 = 0;
    while ($valor >= 50) {
        $notas50++;
        $valor -= 50;
    }

    $notas20 = 0;
    while ($valor >= 20) {
        $notas20++;
        $valor -= 20;
    }

    $notas10 = 0;
    while ($valor >= 10) {
        $notas10++;
        $valor -= 10;
    }

    echo "$notas50 nota(s) de R$ 50\n";
    echo "$notas20 nota(s) de R$ 20\n";
    echo "$notas10 nota(s) de R$ 10\n";
?>