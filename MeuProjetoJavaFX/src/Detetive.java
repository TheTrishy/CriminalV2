using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CriminalV2.MeuProjetoJavaFX.MeuProjetoJavaFX.MeuProjetoJavaFX.MeuProjetoJavaFX.src
{
	class Detetive
    {
        String nome;
        int identificacao;
        int anosDeServico;
        String especialidade;
    }
    public Detetive(String nome, int identificacao, int anosDeServico, String especialidade)
    {
        this.nome = nome;
        this.identificacao = identificacao;
        this.anosDeServico = anosDeServico;
        this.especialidade = especialidade; 
    }
}