using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CriminalV2.MeuProjetoJavaFX.MeuProjetoJavaFX.MeuProjetoJavaFX.MeuProjetoJavaFX.src
{
    class Suspeito
    {
        String nome;
        int idade;
        String historicoCriminal;
        String alibi;
        String relacaoComOCaso;
    }
    public Suspeito(String nome, int idade, String historicoCriminal, String alibi, String relacaoComOCaso)
    {
        this.nome = nome;
        this.idade = idade;
        this.historicoCriminal = historicoCriminal;
        this.alibi = alibi;
        this.relacaoComOCaso = relacaoComOCaso;
    }
}