package com.turgaydede.lambdaExpression;
/**
 * Tek bir soyut metoda sahip arayüzü gerçekleştiren ifadelerdir.
 * İsimsiz classlar normal classların kısaltması ise, isimsiz class ların kısaltması lambda expressiondır.
 * Lambda ifadesi pratikte bir fonksiyona karşılık gelir. Metodun override edilmiş halidir.
 * Lambda ifadesiyle gerçekleştirilecek arayüzde sadece bir tane soyut metot olmalıdır.
 * Lambda ifadesi de o tek olan soyut metoda bir gerçekleştirme verir.
 * Fonksiyonel arayüzlerde "default" ve "static" metot olabilir.
 * @FunctionalInterface kullanmasak sorun olmaz ama kullanıldığında birden fazla soyut metot yazıldığın durumda hata vererek uyarır.
 *
 * Gerçeklediği arayüzün tipinde bir değişkene atanma,
 * Gerçeklediği arayüzün tipinde argüman alan bir metoda ya da kurucuya parametre geçilme,
 * Gerçeklediği arayüzün tipinde bir dönüş değerine sahip metottan döndürülme durumlarında kullanılabilir.
 * */

@FunctionalInterface
public interface Math {
    double calculate(double arg1, double arg2);
}
