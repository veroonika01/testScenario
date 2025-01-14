

###Testovací prípad TC- kompletný proces objednania tovaru na stránke [https://www.saucedemo.com/inventory.html]

**Predpoklady**: používateľ je zaregistrovaný a má vytvorený účet do ktorého sa prihlasuje pod svojím užívateľským menom a heslom

---

###Testovacie kroky##

1. **Prihlásenie používateľa**
- Otvorenie prehliadača a navigácia  na URL [https://www.saucedemo.com/inventory.html]
- Zadanie používateľského mena a hesla a kliknutie na tlačidlo "Login"


2. **Zobrazenie produktov na stránke**
- Na Homepage sa užívateľoví zobrazí ponuka produktov s uvedeným názvom,krátkym popisom produktu, cenou a možnosťou kliknúť na  tlačidlo "Add to Cart"

2. ** Pridanie tovaru do nákupného košíka"
- Používateľ klikne na tlačídlo "Add to card" prislúchajúce k zvolenému produktu, ktoré sa zmení na  "Remove"
- ikona nákupného košíka v pravom hornom rohu sa zmení a zobrazí počet pridaných produktov do košíka

4. **Kontrola obsahu nákupného košíka**
- Používateľ klikne na ikonu nákupného košíka, následne je presmerovaný do sekcie "Your Cart"
- sekcia "Your Cart" by mala obsahovať vybrané položky nákupného košíka s popisom, zobrazeným presným množstvom a zodpovedajúcou cenou

5. **Pokladňa**
- V sekcii "Your Cart" si používateľ môže zvoliť z dvoch možností, a to "Continue Shopping", ktorá ho presmeruje na domovskú stránku, v tomto prípade pokračuje v dokončení objednávky a  zvolí tlačidlo "Checkout"

6. **Vyplnenie údajov o objednávke**
Následne je používateľ presmerovaný na sekciu "Checkout: Your Information" kde postupne vypĺňa do 3 textových polí zoradených pod sebou svoje údaje v poradí 1. textové pole by malo obsahovať meno, druhé priezvisko a do posledného textového poľa zadáva poštové smerové číslo. Z dvoch zobrazených možností zvolí a klikne na tlačidlo "Continue".

7. **Súhrn objednávky**
Používateľ je presmerovaný do sekcie "Checkout: Overview" ktorá obsahuje kompletnú informáciu a vytváranej objednávke:

* položka objednávky s jej krátkym popisom, objednavaným množstvom a cenou
*informácie o platbe: číslo kreditnej/debetnej karty
*informácie o doprave, kde bude uvedený názov prepravnej spoločnosti a cena za dopravu
* celková cena za obednávku, ktorá je súčtom ceny produktu a dane

8. **Dokončenie objednávky**
Na stránke za zobrazia  dve tlačidlá:
-zrušiť objednávku (tlačidlo Cancel), po zakliknutí presmeruje používateľa na domovskú stránku
- používateľ zvolí a klikne na tlačidlo "Finish", teda dokončenie objednávky

9. **Potvrdenie objednávky**
Po potvrdení objednávky sa zmení stav na "Checkout: Complete!" so hláškou: **Thank you for your order!** potvrdzujúcou úspešné vytvorenie objednávky.

10. **Návrat na domovskú stránku**
Pre návrat na Homepage používateľ klikne na tlačidlo "Back Home", ktoré ho presmeruje na hlavnú stránku.

11. **Odhlásenie používateľa**
-v ľavom hornom rohu používateľ klikne na Hamburger-menu, kde je jednou z vylistovaných možností odhlásenie "Logout", zvolí si danú možnosť a dostáva sa na stránku na prihlásenie do aplikácie.


---



##### Výsledok testu: Pass/Fail