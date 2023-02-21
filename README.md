# Banking_Client
test_running

On utilisera cette partie pour effectuer des test de notre web service

Sur intellij, nous creons un nouveau projet "Bank_Client"
On import les dependence de JAX

Ensuite a partir du WSD, nous allons generer des class JAVA qui permettrons la communications avec le 
web_service. 
Pour ce faire, dans l'onglet "Help" on va cliquer sur "find action" et selectionner "Generate Java from WSDL"

PS: si vous ne retrouvez pas cette action, installer le pluging "Jakarta EE: Web Services"

Alors, apres selectionner notre action, on cole le lien de notre wsdl pour l'etape suivante, puis
on nome un package pour notre import.

Il ne nous reste plus qu'a cree un client (une main class java) pour consommer le web service.
A l'aide du middleware (intermediaire) qui permet a l'application de communiquer avec le web service.
eq: BanqueService stub = new BankWS().getBanqueServicePort();
The stub here, is acting as our medium (just a simple variable)
