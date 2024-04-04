package org.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestMockAPUtilisateur {
    @Mock
    private UtilisateurAp utilisateurApMock;
    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // TODO : Configuration du comportement du mock, utiliser la directive « when » avec sa méthode « thenReturn »
        doNothing().when(utilisateurApMock).creerUtilisateur(utilisateur);

        // TODO : Création du service avec le mock
        UserService userService = new UserService(utilisateurApMock);

        // TODO : Appel de la méthode à tester
        try {
            userService.creerUtilisateur(utilisateur);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        // TODO : Vérification de l'appel à l'API
        verify(utilisateurApMock, times(1)).creerUtilisateur(utilisateur);
    }
}