<?php

    /*De um array de salários, dê um aumento de 10%
    a quem ganha abaixo de 2000. */

    $salarios = [1500, 2500, 1800, 3000, 1200, 2200];

    echo "Salários normais:\n";
    print_r($salarios);

    echo "\n";

    foreach ($salarios as $i => $salario) {
        if ($salario < 2000) {
            $salarios[$i] = $salario * 1.10;
        }
    }

    echo "Salários com Aumento:\n";
    print_r($salarios);
?>