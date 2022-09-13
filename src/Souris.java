
public class Souris {

    private int _poids;
    private int _age;
    private String _couleur;
    private int _esperanceVie;
    private boolean _clonee;
    public static final int ESPERANCE_VIE_DEFAUT = 36;
    static int compteur = 0;

    public Souris(int unPoids, int unAge, String uneCouleur, int uneEsperanceVie) {
        this._poids = unPoids;
        this._age = unAge;
        this._couleur = uneCouleur;
        this._esperanceVie = uneEsperanceVie;
        this._clonee = false;
        compteur += 1;

        System.out.println("Une nouvelle souris !");

    }

    Souris(int unPoids, String uneCouleur, int unAge) {
        this._poids = unPoids;
        this._couleur = uneCouleur;
        this._age = unAge;
        this._esperanceVie = ESPERANCE_VIE_DEFAUT;
        this._clonee = false;
        compteur += 1;
        System.out.println("Une nouvelle souris !");
    }

    Souris(int unPoids, String uneCouleur) {
        this._poids = unPoids;
        this._couleur = uneCouleur;
        this._age = 0;
        this._esperanceVie = ESPERANCE_VIE_DEFAUT;
        this._clonee = false;
        compteur += 1;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(Souris souris) {
        this._poids = souris._poids;
        this._age = souris._age;
        this._couleur = souris._couleur;
        this._esperanceVie = 4 * (souris._esperanceVie) / 5;
        this._clonee = true;
        compteur += 1;
        System.out.println("Clone d'une souris !");
    }

    public int vieillir() {

        _age = _age + 1;
        if (this._clonee == true) {
            if (_age > _esperanceVie / 2) {
                _couleur = "verte";
            }
        }
        return _age;

    }

    public void evolue() {
        while (this._age < _esperanceVie) {
            vieillir();
        }

    }

    @Override
    public String toString() {

        String result;
        result = "Une souris " + this._couleur + " ";

        if (_clonee == true) {
            result += "clonée";
        }
        result += " de " + this._age + " mois et pesant " + this._poids + " grammes";

        return (result);

    }

    static String compteur() {

        String resultat = "il y a " + compteur + " souris";
        return resultat;
    }

    /////////////// Getter and setter //////////////////

    public int get_poids() {
        return _poids;
    }

    public void set_poids(int _poids) {
        this._poids = _poids;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public String get_couleur() {
        return _couleur;
    }

    public void set_couleur(String _couleur) {
        this._couleur = _couleur;
    }

    public int get_esperanceVie() {
        return _esperanceVie;
    }

    public void set_esperanceVie(int _esperanceVie) {
        this._esperanceVie = _esperanceVie;
    }

    public boolean is_clonee() {
        return _clonee;
    }

    public void set_clonee(boolean _clonee) {
        this._clonee = _clonee;
    }

}
