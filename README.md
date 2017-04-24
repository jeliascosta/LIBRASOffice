# LIBRASOffice
Este é o repositório oficial do LIBRASOffice, um aplicativo desktop que se propõe a auxiliar um usuário surdo de computador - que geralmente não domina o português (língua escrita), mas sim a Língua Brasileira de Sinais (LIBRAS) - a utilizar a suíte de escritório LibreOffice, livre e de código aberto, de forma autônoma. LIBRASOffice é um projeto acadêmico idealizado e atualmente desenvolvido no Laboratório de Informática para Educação da Universidade Federal do Rio de Janeiro (LIpE/UFRJ, lipe@poli.ufrj.br).

Desenvolvedor principal: Jônathan Elias Sousa da Costa (jelias@poli.ufrj.br), graduando em Engenharia de Computação e Informação na UFRJ.
# Organização de Repositórios
Repositório "LASOBack": guarda um clone do repositório core do LibreOffice (LO) que está sendo atualmente utilizado pelo LIBRASOffice (LASO). Em cima do clone são realizadas modificações em alguns módulos do LO, a nível de código-fonte C++, para o bom funcionamento do LASO. Porcuramos manter o branch utilizado sempre atualizado, ou seja, correspondendo a uma das últimas versões estáveis do LibreOffice (p. ex: LO Estável -> ABRIL/2017 -> libreoffice-5-2-7 -> LASOBack).
Repositório "LASOFront": guarda todo o código-fonte Java do LASO que efetivemente implementa a interação visual em LIBRAS com o LibreOffice, utlizando o LASOBack para algumas funções e a API UNO do LibreOffice para outras.
