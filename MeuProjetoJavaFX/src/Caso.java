using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CriminalV2.MeuProjetoJavaFX.MeuProjetoJavaFX.MeuProjetoJavaFX.MeuProjetoJavaFX.src
{
    class Caso
    {
        abstract class Caso
        {
            int numeroCaso;
            String descricao;
            Detetive detetiveResponsavel;
            List<Evidencia> evidencias = new ArrayList<>();
            List<Suspeito> suspeitos = new ArrayList<>();
            String status;
            LocalDate dataAbertura;
            
            public Caso(int numeroCaso, String descricao, Detetive detetiveResponsavel)
            {
                this.numeroCaso = numeroCaso;
                this.descricao = descricao;
                this.detetiveResponsavel = detetiveResponsavel;
                this.status = "Em andamento";
                this.dataAbertura = LocalDate.now();
            }
            public void adicionarEvidencia(Evidencia evidencia)
            {
                evidencias.add(evidencia);
            }
            public void adicionarSuspeito(Suspeito suspeito)
            {
                suspeitos.add(suspeito);
            }
            public abstract void gerarRelatorioProgresso()
            {
            }
        }
        class Homicidio extends Caso
        {
            public Homicidio(int numeroCaso, String descricao, Detetive detetiveResponsavel)
            {
                super(numeroCaso, descricao, detetiveResponsavel);
            }
            @Override
            public void gerarRelatorioProgresso()
            {
            // Implementação específica para Homicídio
            }
        }
    }
    class Roubo extends Caso
    {
        public Roubo(int numeroCaso, String descricao, Detetive detetiveResponsavel)
        {
            super(numeroCaso, descricao, detetiveResponsavel);
        }
        @Override
        
        public void gerarRelatorioProgresso()
        {
          // Implementação específica para Roubo
        }
    }
    class Fraude extends Caso
    {
        public Fraude(int numeroCaso, String descricao, Detetive detetiveResponsavel)
    {
        super(numeroCaso, descricao, detetiveResponsavel);
    }
    @Override
    
    public void gerarRelatorioProgresso()
    {
    // Implementação específica para Fraude
    }
}