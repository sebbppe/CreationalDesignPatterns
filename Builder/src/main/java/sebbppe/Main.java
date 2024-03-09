package sebbppe;

import sebbppe.builder.Form530Builder;
import sebbppe.builder.Form532Builder;
import sebbppe.builder.Form534Builder;
import sebbppe.forms.Form530;
import sebbppe.forms.Form532;
import sebbppe.forms.Form534;
import sebbppe.models.Cash;
import sebbppe.models.Declarant;
import sebbppe.models.RepTitles;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Declarant oto = new Declarant("Oto", "", "Villa", "Koko");
        Cash cash = new Cash("USD", 20000.0);
        RepTitles titles = new RepTitles("Cheque", "USD", 50000.2);
        Declarant hul = new Declarant("Hul", "Ji", "Poi", "Lio");
        Cash cashHul = new Cash("USD", 185000.0);
        RepTitles titlesHul = new RepTitles("Cheque", "USD", 50002.2);

        //Builder to form 530
        Form530Builder builder530=new Form530Builder();
        builder530.buildDate(LocalDate.now())
                .buildNameDeclarant(oto)
                .buildTypeDocument("CC")
                .buildNumberDocument("102231321")
                .buildDeclareCash(cash)
                .buildDeclareRepTitles(titles);
        Form530 form530deOto=builder530.build();
        //reset builder
        builder530.reset();
        builder530.buildDate(LocalDate.now())
                .buildNameDeclarant(hul)
                .buildTypeDocument("CC")
                .buildNumberDocument("10232321")
                .buildDeclareCash(cashHul)
                .buildDeclareRepTitles(titlesHul);
        Form530 form530deHul = builder530.build();

        //Builder to form 532
        Form532Builder builder532=new Form532Builder();
        builder532.buildDate(LocalDate.now())
                .buildNameDeclarant(oto)
                .buildNit("102231321-2")
                .buildDeclareCash(cash);
        Form532 form532deOto=builder532.build();
        //reset builder
        builder532.reset();
        builder532.buildDate(LocalDate.now())
                .buildNameDeclarant(hul)
                .buildNit("10232321-3")
                .buildDeclareCash(cashHul);
        Form532 form532deHul = builder532.build();


        //Builder to form 534
        Form534Builder builder534=new Form534Builder();
        builder534.buildDate(LocalDate.now())
                .buildNameDeclarant(oto)
                .buildTypeDocument("CC")
                .buildNumberDocument("102231321")
                .buildDeclareRepTitles(titles);
        Form534 form534deOto=builder534.build();
        //reset builder
        builder534.reset();
        builder534.buildDate(LocalDate.now())
                .buildNameDeclarant(hul)
                .buildTypeDocument("CC")
                .buildNumberDocument("10232321")
                .buildDeclareRepTitles(titlesHul);
        Form534 form534deHul = builder534.build();

        //print 530forms
        System.out.println(form530deOto);
        System.out.println(form530deHul);
        //print 532forms
        System.out.println(form532deOto);
        System.out.println(form532deHul);
        //print 534forms
        System.out.println(form534deOto);
        System.out.println(form534deHul);

    }
}