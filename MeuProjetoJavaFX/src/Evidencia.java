using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CriminalV2.MeuProjetoJavaFX.MeuProjetoJavaFX.MeuProjetoJavaFX.MeuProjetoJavaFX.src
{
    class Evidencia
    {
    }
}
abstract class Evidencia
{
    String descricao;
    LocalDate dataColeta;

    public Evidencia(String descricao, LocalDate dataColeta)
    {
        this.descricao = descricao;
        this.dataColeta = dataColeta;
    }
}

class Digital extends Evidencia
{
    String tipoDeArquivo;
    String origem;
    
    public Digital(String descricao, LocalDate dataColeta, String tipoDeArquivo, String origem)
    {
        super(descricao, dataColeta);
        this.tipoDeArquivo = tipoDeArquivo;
        this.origem = origem;
    }
}
class Fisica extends Evidencia
{
    String tipoDeObjeto;
    String localEncontrado;

    public Fisica(String descricao, LocalDate dataColeta, String tipoDeObjeto, String localEncontrado)
    {
    super(descricao, dataColeta);
    this.tipoDeObjeto = tipoDeObjeto;
    this.localEncontrado = localEncontrado;
    }
}