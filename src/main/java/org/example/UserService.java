package org.example;

public class UserService {
    private final UtilisateurAp utilisateurApi;
    public UserService(UtilisateurAp utilisateurApi) {
        this.utilisateurApi = utilisateurApi;
    }
    public void creerUtilisateur(Utilisateur utilisateur) throws
            ServiceException {
        utilisateurApi.creerUtilisateur(utilisateur);
    }
}
