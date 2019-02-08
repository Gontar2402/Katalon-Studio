
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "help_pack.Text_from_input.Copy_text"(
    	TestObject to	) {
    (new help_pack.Text_from_input()).Copy_text(
        	to)
}

def static "help_pack.Text_from_input.Paste_text"(
    	TestObject to	) {
    (new help_pack.Text_from_input()).Paste_text(
        	to)
}

def static "help_pack.wait_for_text.not_Present"(
    	String text	
     , 	int time	) {
    (new help_pack.wait_for_text()).not_Present(
        	text
         , 	time)
}

def static "help_pack.wait_for_text.Present"(
    	String text	
     , 	int time	) {
    (new help_pack.wait_for_text()).Present(
        	text
         , 	time)
}

def static "help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie"(
    	int nr_kolumny_do_sortowania	
     , 	int liczba_sortowan	) {
    (new help_pack.Filtruj()).pobieranie_danych_do_filtrowania_oraz_filtrowanie(
        	nr_kolumny_do_sortowania
         , 	liczba_sortowan)
}

def static "help_pack.filtrowanie_tabeli.filtrowanie"(
    	String sciezka_tabeli	
     , 	int od_kolumny_nr	
     , 	int do_kolumny_nr	
     , 	int z_ktorego_wiersza_wartosc	) {
    (new help_pack.filtrowanie_tabeli()).filtrowanie(
        	sciezka_tabeli
         , 	od_kolumny_nr
         , 	do_kolumny_nr
         , 	z_ktorego_wiersza_wartosc)
}

def static "help_pack.filtrowanie_tabeli.Sortowanie"(
    	String sciezka_tabeli	
     , 	int od_kolumny_nr	
     , 	int do_kolumny_nr	) {
    (new help_pack.filtrowanie_tabeli()).Sortowanie(
        	sciezka_tabeli
         , 	od_kolumny_nr
         , 	do_kolumny_nr)
}

def static "help_pack.Sortowanie_tabeli.Sortowanie"(
    	int od_kolumny_nr	
     , 	int do_kolumny_nr	
     , 	int liczba_wierszy_do_sortowania	) {
    (new help_pack.Sortowanie_tabeli()).Sortowanie(
        	od_kolumny_nr
         , 	do_kolumny_nr
         , 	liczba_wierszy_do_sortowania)
}

def static "help_pack.Tworzenie_dokumentu.wychodzacego_z_plikiem"() {
    (new help_pack.Tworzenie_dokumentu()).wychodzacego_z_plikiem()
}

def static "help_pack.Tworzenie_dokumentu.wychodzacego_w_obiegu_papierowym"(
    	String nazwa_dokumentu_wychodzacego	) {
    (new help_pack.Tworzenie_dokumentu()).wychodzacego_w_obiegu_papierowym(
        	nazwa_dokumentu_wychodzacego)
}

def static "help_pack.Tworzenie_dokumentu.wewnetrznego"(
    	String Nazwa_dokumentu_wew	) {
    (new help_pack.Tworzenie_dokumentu()).wewnetrznego(
        	Nazwa_dokumentu_wew)
}

def static "help_pack.Logowanie.zaloguj"(
    	String username	
     , 	String password	) {
    (new help_pack.Logowanie()).zaloguj(
        	username
         , 	password)
}

def static "help_pack.Logowanie.zaloguj_na_stronie_admin_php"(
    	String username	
     , 	String password	) {
    (new help_pack.Logowanie()).zaloguj_na_stronie_admin_php(
        	username
         , 	password)
}

def static "help_pack.Logowanie.zaloguj_na_stronie_archiwum"(
    	String username	
     , 	String password	) {
    (new help_pack.Logowanie()).zaloguj_na_stronie_archiwum(
        	username
         , 	password)
}

def static "help_pack.Wait_and_click.Clickable"(
    	TestObject to2	
     , 	int max_liczba_prob	) {
    (new help_pack.Wait_and_click()).Clickable(
        	to2
         , 	max_liczba_prob)
}

def static "help_pack.Tworzenie_sprawy.tworzenie_sprawy"(
    	String nazwa_sprawy	) {
    (new help_pack.Tworzenie_sprawy()).tworzenie_sprawy(
        	nazwa_sprawy)
}

def static "help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text"(
    	String szukany_tekst	
     , 	int nr_pola_input	) {
    (new help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem()).set_text(
        	szukany_tekst
         , 	nr_pola_input)
}

def static "help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text"(
    	TestObject pole_wyszukiwania	
     , 	String szukany_tekst	) {
    (new help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz()).set_text(
        	pole_wyszukiwania
         , 	szukany_tekst)
}

def static "help_pack.Wyloguj.wyloguj"() {
    (new help_pack.Wyloguj()).wyloguj()
}

def static "help_pack.Wyloguj.wyloguj_na_adminie"() {
    (new help_pack.Wyloguj()).wyloguj_na_adminie()
}

def static "help_pack.Wyloguj.wyloguj_archiwum"() {
    (new help_pack.Wyloguj()).wyloguj_archiwum()
}

def static "help_pack.Otworz_przegladarke.Otworz"() {
    (new help_pack.Otworz_przegladarke()).Otworz()
}

def static "help_pack.Otworz_przegladarke.Otworz_admin"() {
    (new help_pack.Otworz_przegladarke()).Otworz_admin()
}

def static "help_pack.Set_text_and_press_enter.set_text"(
    	TestObject to2	
     , 	String tekst	) {
    (new help_pack.Set_text_and_press_enter()).set_text(
        	to2
         , 	tekst)
}

def static "help_pack.Set_text_and_press_enter.na_adminie"(
    	TestObject to2	
     , 	String tekst	) {
    (new help_pack.Set_text_and_press_enter()).na_adminie(
        	to2
         , 	tekst)
}

def static "help_pack.metryka_sprawdz_statna_czynnosc.szczegoly_metryka_ostatnia_czynnosc1"(
    	String ostatnia_czynnosc	
     , 	String ostatnia_osoba	) {
    (new help_pack.metryka_sprawdz_statna_czynnosc()).szczegoly_metryka_ostatnia_czynnosc1(
        	ostatnia_czynnosc
         , 	ostatnia_osoba)
}

def static "help_pack.metryka_sprawdz_statna_czynnosc.sprawdz_informacje"(
    	String ostatnia_czynnosc	
     , 	String ostatnia_osoba	) {
    (new help_pack.metryka_sprawdz_statna_czynnosc()).sprawdz_informacje(
        	ostatnia_czynnosc
         , 	ostatnia_osoba)
}
