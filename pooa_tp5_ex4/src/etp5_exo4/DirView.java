package etp5_exo4;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DirView implements Serializable {
    private static final long serialVersionUID = 1L;
    private File dossier;
    private List<FichierTransfert> fichiers;

    public DirView(String cheminDossier) {
        this.dossier = new File(cheminDossier);
        this.fichiers = new ArrayList<>();

        if (dossier.exists() && dossier.isDirectory()) {
            File[] listeFichiers = dossier.listFiles();
            if (listeFichiers != null) {
                for (File fichier : listeFichiers) {
                    if (fichier.isFile()) {
                        fichiers.add(new FichierTransfert(fichier));
                    }
                }
            }
        }
    }

    public void afficherRepertoire() {
        System.out.println("Fichiers disponibles :");
        for (int i = 0; i < fichiers.size(); i++) {
            System.out.println(i + " - " + fichiers.get(i).getNom());
        }
    }

    public FichierTransfert getFichier(int nb) {
        if (nb >= 0 && nb < fichiers.size()) {
            return fichiers.get(nb);
        }
        return null;
    }

    public List<FichierTransfert> getFichiers() {
        return fichiers;
    }
}