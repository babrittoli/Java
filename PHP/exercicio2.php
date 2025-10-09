 
<?php

    /*Crie um array de notas de alunos (ex.: 4 notas). 
    Calcule a média de cada um usando foreach. 
    Mostre se foi aprovado (>= 6) ou reprovado usando if/else.*/

    // Array das 4 notas 
    $notas = [7, 5, 3, 4];

    // Foreach para Soma
    $soma = 0;
    foreach ($notas as $nota) {
        $soma = $soma + $nota;
    }

    // Média das notas
    $media = $soma / count($notas);

    // Condicional de aprovação ou reprovação
    if ($media >= 6) {
        echo "Média: " . $media . " Aprovado";
    } else {
        echo "Média: " . $media . " Reprovado";
    }
?>