/*
 * SportChef – Sports Competition Management Software
 * Copyright (C) 2016 Marcus Fihlon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ch.fihlon.demo.jsr354;

import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.util.Locale;

public class FormatDemo {

    public static void main(final String... args) {

        final MonetaryAmount amount = Money.of(123.456, "EUR");

        final MonetaryAmountFormat formatDE = MonetaryFormats.getAmountFormat(Locale.GERMANY);
        System.out.println(formatDE.format(amount));

        final MonetaryAmountFormat formatCH = MonetaryFormats.getAmountFormat(new Locale("de_CH"));
        System.out.println(formatCH.format(amount));

        final MonetaryAmountFormat formatUS = MonetaryFormats.getAmountFormat(Locale.US);
        System.out.println(formatUS.format(amount));
    }

}
