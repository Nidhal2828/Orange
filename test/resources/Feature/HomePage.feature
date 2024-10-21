#Author: Nidhal
Feature: Consultation du menu de la Home Page

  Scenario Outline: Accéder à chaque menu de la page daccueil
    Given utilisateur est connecte avec le bon username "Admin" et le bon password "admin123"
    When utilisateur clique sur le "<menu>"
    Then la page du menu est affiche qui contient le nom du "<menu>"

    Examples: 
      | menu         |
      | PIM          |
      | Admin        |
      | Leave        |
      | Time         |
      | Recruitement |
      | My Info      |
      | Performance  |
      | Dashboard    |
      | Directory    |
      | Maintenance  |
      | Claim        |
      | Buzz         |
