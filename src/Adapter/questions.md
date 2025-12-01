### Payment Question
Um antigo sistema de pedidos chamado FoodNow possui apenas o método **processPayment(double value)**.
Uma nova API moderna chamada QuickEats exige mais informações para funcionar, usando o método **processPayment(String clientName, double value)**.

### Media Player Question
Um sistema simples de reprodução de mídia foi desenvolvido para tocar apenas arquivos MP3 por meio de uma interface chamada MediaPlayer, que possui o método **play(String fileName)**. Esse sistema utiliza uma classe chamada BasicMediaPlayer, responsável exclusivamente por reproduzir arquivos MP3.

No entanto, uma nova biblioteca mais completa foi adicionada ao projeto. Essa biblioteca, chamada AdvancedMediaPlayer, consegue tocar vários formatos de arquivo, como mp4, avi e vlc. Ela usa um método diferente: **play(String mediaType, String fileName)**, que exige tanto o tipo da mídia quanto o nome do arquivo.