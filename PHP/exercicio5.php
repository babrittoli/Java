<?php

    /*Monte um carrinho de compras com produtos e preços, 
    use array, calcule total e mostre um recibo formatado.*/
    
    $carrinho = [
        'Arroz' => 25.90,
        'Feijão' => 8.50,
        'Macarrão' => 4.20,
        'Açúcar' => 3.80,
        'Café' => 12.00
    ];

    $total = 0;

    echo "========== RECIBO ==========\n\n";

    foreach ($carrinho as $nome => $preco) {
        $precoFormatado = number_format($preco, 2, ',', '.'); // formatação brasileira de dinheiro
        echo "$nome: R$ $precoFormatado\n";
        $total += $preco;
    }

    $totalFormatado = number_format($total, 2, ',', '.'); // formatação brasileira de dinheiro
    echo "\n";
    echo "\n";
    echo "\nTotal: R$ $totalFormatado\n";
    echo "============================\n";
?>