(function () {
  document.getElementById('contactForm').addEventListener('submit', function(){
        var nome = this.querySelector('input[name=nome]'), nome = nome.value;
        var email = this.querySelector('input[name=e-mail]'), email = email.value;
        var mensagem = this.querySelector('input[name=mensagem]'), mensagem = mensagem.value;
        var texto = 'Olá destinatário, \nMeu nome é '+ nome +' e meu email é '+ email;
        this.querySelector('input[name=Body]').setAttribute('value', texto);
    });
  });