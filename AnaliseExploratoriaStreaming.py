# -*- coding: utf-8 -*-
"""Untitled0.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/16oUZonAtba0cl6YetR47D_IktCLIuu6m
"""

#Importação de bibliotecas necessárias para análise
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np

#Salvando o caminho do diretório numa variável e carregando o arquivo .csv
Armaze_DataFrame = "/content/AnaliseEDA.csv"
df = pd.read_csv(Armaze_DataFrame)

#exibindo dimensão do conjunto de dados e exibindo-o
print("Dimensão dos dados:")
print("Linhas (Instâncias): {}".format(df.shape[0]))
print("Colunas (Atributos): {}".format(df.shape[1]))

df

#Exibindo o tipo de dado presente em cada instância
df.info()

#Mostrando de forma descritiva cada atributo do DataFrame
df.describe()

#Carregando coeficiente de correlação de Pearson
corr = df.corr()
corr

#Apresentando a correlação através de um mapa de calor.
f, ax = plt.subplots(figsize=(15, 15))
plt.title('Correção de Pearson - HeatMap')

sns.heatmap(df.corr(),linewidths=0.7,vmax=1.0, square=True, annot=True)

#Fazendo a verificação do aplicativo de streaming mais utilizado
frequencia_app = df['Primary streaming service'].value_counts()
app_mais_frequente = frequencia_app.idxmax()

print(f'O aplicativo mais frequente é: {app_mais_frequente}')

#Fazendo a correlação linear entre as variáveis Horas por dia e depressão
corr_two = df['Hours per day'].corr(df['Depression'])
corr_two

# Fazer um gráfico de dispersão com a linha de regressão
plt.figure(figsize=(8, 6))
sns.regplot(x=df['Hours per day'], y=df['Depression'], data=df, ci=None)
plt.title('Gráfico de Dispersão e Linha de Regressão')
plt.xlabel('Hours per day')
plt.ylabel('Depression')
plt.show()