package crawler

class ConvenioController  {

    static namespace = 'convenio'

    def index() {

        /*
        final def URI = 'https://backend-site-operadora.rj.r.appspot.com'
        final def EMAIL = 'HospitalBomAtendimento@gmail.com.br'
        final def SENHA = '34$33'

        def result = configure {
            request.uri = URI
            request.contentType = JSON[0]
        }.post{
            request.uri.path = '/login'
            request.body = [email: EMAIL, senha: SENHA]
            request.contentType = 'application/json'
            request.encoder 'application/x-www-form-urlencoded', NativeHandlers.Encoders.&form
        }

        def token = result.tokenDeAcesso
        def parameter = configure {
            request.uri = URI
        }.get{
            request.uri.path = '/demonstrativos'
            request.uri.query = [listarTodos : true , tokenDeAcesso : token]
        }

        def listaDemonstrativos = parameter.demonstrativos.url
        for(def demosnstrativos : listaDemonstrativos){
            def arquivoSplit = demosnstrativos.toString().split("/demonstrativoFiles([?!.,])fileName=")
            def arquivo = arquivoSplit[1].toString()
            def endpoint = "/demonstrativoFiles"

            File newFile = new File("Downloads/${arquivo}.xlsx");
            File file = configure {
                request.uri = URI
                request.uri.path = endpoint
                request.uri.query = [fileName : arquivo, tokenDeAcesso: token]
            }.get{
                Download.toFile(delegate, newFile)
            }
            file.createNewFile()
        }*/

        respond "testando"
    }
}
