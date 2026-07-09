# Paquete personal para creación de notas

## Objetivo

- Paquete personalizado para facilitar la creación y homogenización de notas en LaTeX.
- Contener los paquetes requeridos.
- Contener las definiciones de comandos y entornos personalizados.
- Incluye archivo .cwl (_completion word list_) para autocompletado en TexStudio

## Características

- Se
- Prefijos: Convención de prefijos para todos los entornos y comandos definidos en el paquete.
- Módulos: Contiene varios módulos, que agrupan los comandos y entornos por área de aplicación.
  - El paquete principal funciona como dispatcher.
  - Evita la carga de paquetes innecesarios.
  - Estructura:
    - noteskit.sty Paquete principal, carga módulos.
    - notes-kit-sections.sty Secciones (objetivos, conclusiones, citas, resumen)
    - notes-kit-code.sty Resaltado de código, estilos para lenguajes, etc.
    - notes-kit-base.sty Código compartido entre módulos (helpers internos, configuraciones de colores común, prefijo).
- Estilo: Contiene un documento aparte con la configuración.
  - Se pueden personalizar los estilos por cada repositorio que utilice el paquete, para que no se modifique el .sty principal

## Utilidades

1. Agregar a documento

```
\makeatletter
\def\input@path{{rsc/pckg/template-package/}}
\makeatother
\usepackage{noteskit}
```

2. Actualizar

3. [Actualizarte SSH-Public/Private-Keys](https://github.com/imthenachoman/How-To-Secure-A-Linux-Server#ssh-publicprivate-keys)

```
ssh-keygen -t ed25519
```

### Estructura

my-project/

├── src/

│ ├── components/

│ │ └── Button.js
│ └── index.js
├── tests/
│ └── test.js
├── package.json
└── README.md
