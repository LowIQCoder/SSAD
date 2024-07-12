<a id="readme-top"></a>

<!-- PROJECT SHIELDS -->
[![Contributors][contributors-shield]][contributors-url]
[![MIT License][license-shield]][license-url]
[![Issues][issues-shield]][issues-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://gitlab.pg.innopolis.university/team20/llm-rosalind">
    <img src="images/logo.jfif" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">Graphit</h3>

  <p align="center">
    <a href="https://gitlab.pg.innopolis.university/team20/llm-rosalind/issues">Report Bug</a>
    ·
    <a href="https://gitlab.pg.innopolis.university/team20/llm-rosalind/issues">Request Feature</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#run-api">Run API</a></li>
        <li><a href="#run-frontend">Run Frontend</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project


LLM Rosalind offers a distinctive approach to studying and developing new courses.

Reasons to consider LLM Rosalind:

- Automatic course creation from various sources utilizing LLM
- An intuitive and visually appealing interface
- The possibility to find a variety of courses on different topics
- Different levels of difficulty within the same course
<p align="right"><a href="#readme-top">⬆️</a></p>

### Built With

 [![Pytorch][Pytorch]][Pytorch-url]
 
 [![Milvus][Milvus]][Milvus-url]
 
 [![Nougat][Nougat]][Nougat-url]
 
 [![Langchain][Langchain]][Langchain-url]
 
 [![Transformers][Transformers]][Transformers-url]
 
 [![React][React]][React-url]
 
 [![TS][TS]][TS-url]
 
 [![Asyncpg][Asyncpg]][Asyncpg-url]
 
 [![Next][Next.js]][Next-url]
 
 [![FastAPI][FastAPI]][FastAPI-url]

<p align="right"><a href="#readme-top">⬆️</a></p>


## Launch API

Clone repository with latest version of API
```sh
git clone https://gitlab.pg.innopolis.university/team20/llm-rosalind.git -b feature_refactor_backend
```
Install [Poetry](https://python-poetry.org/docs/) and [Conda](https://conda.io/projects/conda/en/latest/index.html)

Create and activate conda envoirement

```sh
conda create --name rosalind python=3.11
conda activate rosalind
```

Setup dependencies for api
```sh
poetry install
```
Setup the .env file
```
# For database
POSTGRES_DB=someDB
POSTGRES_USER=someUser
POSTGRES_PASSWORD=somePW
POSTGRES_HOST=0.0.0.0
POSTGRES_PORT=9999
# For static files
STATIC_FILES_UPLOAD_PATH=/path/to/folder
STATIC_FILES_DOWNLOAD_PATH=/files/upload
```
Run API
```sh
python3 -m src.backend.api
```
## Luanch frontend
Clone repository with latest version of frontend
```sh
git clone https://gitlab.pg.innopolis.university/team20/llm-rosalind.git -b feature/main-page
```
Setup frontend dependencies
```sh
npm install
```
Run development script
```sh
npm run dev
```

<p align="right"><a href="#readme-top">⬆️</a></p>

<!-- ROADMAP -->
# Roadmap

<ul>

<li>
1. Analysis
  <ul>
  <li>🟢 Initial meeting with the customer</li>
  <li>🟢 Collecting requirements</li>
  <li>🟢 Analyzing the problem</li>
  </ul>
</li>  
<li>2. Design 
  <ul>
  <li>🟢 Designing the initial GUI</li>
  <li>🟢 Designing API endpoint design</li>
  <li>🟢 Designing EDR</li>
  <li>🟢 Designing ML pipeline</li>
  </ul>  
</li>
<li>3. MVP-v0 
 <ul>
 <li>🟢 Adjusting GUI to the customer's feedback</li>
 <li>🟢 Implementing the main page</li>
 </ul>
</li>
<li>4. MVP-v1 
 <ul>
 <li>🟢 Adjusting GUI to the customer's feedback</li>
 <li>🟢 Adjusting the main page to the customer's feedback</li>
 <li>🟢 Implementing course preview page</li>
 <li>🟢 Implementing tree view page</li>
 <li>🟢 Implementing theory view page</li>
 </ul>
</li>
<li>5. MVP-v2
 <ul>
 <li>🟢 Implementing task view page</li>
 <li>🟠 Implementing user progress view</li>
 <li>🟠 Implementing course addition view</li>
 <li>🟠 Implementing theory editing view</li>
 <li>🟠 Conducting a comprehensive code review</li>
 </ul>
</li>
<li>6. MVP-v3
 <ul>
 <li>🟠 Integrating with InnoDataHub</li>
 <li>🟠 Implementing tree editing view</li>
 <li>🟠 Implementing task editing view</li>
 </ul>
<li>7. MVP-v4 
 <ul>
 <li>🟠 Assembling AES projects into InnoDataHub</li>
 <li>🟠 Fixing critical bugs</li>
 <li>🟠 Preparing for the demo day</li>
 </ul>
</li>
</ul>

See the [open issues](https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/issues) for a full list of proposed features (and known issues).

<p align="right"><a href="#readme-top">⬆️</a></p>

# Contributing

If you have some ideas on how to make this project better, fork repo and create a pull request

```sh
git checkout -b feature_cool_feature
git commit -m 'Add cool feature'
git push origin feature_cool_feature
```
<p align="right"><a href="#readme-top">⬆️</a></p>

<!-- LICENSE -->
# License

Distributed under the MIT License. See `LICENSE.md` for more information.

<p align="right"><a href="#readme-top">⬆️</a></p>

<!-- CONTACT -->
# Authors

* Dinislam Gabitov - d.gabitov@innopolis.university
* Egor Chernobrovkin - e.chernobrovkin@innopolis.university
* Marsel Berheev - m.berheev@innopolis.university
* Nikita Stepankov - n.stepankov@innopolis.university
* Nikita Tiurkov - n.tiurkov@innopolis.university
* Oleg Shchendrigin - o.shchendrigin@innopolis.university
* Valeriia Neganova - v.neganova@innopolis.university
* Vladimir Bazilevich - v.bazilevich@innopolis.university
* Andrey Palaev - a.palaev@innopolis.university
* Michail Rudakov - m.rudakov@innopolis.university

<p align="right"><a href="#readme-top">⬆️</a></p>

<!-- MARKDOWN LINKS & IMAGES -->
[product_screenshot]: images/llmrosalind.png
[license-url]: LICENSE.md
[license-shield]: https://img.shields.io/badge/License-MIT-blue?style=flat
[contributors-url]: https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/graphs/feature_refactor_backend?ref_type=heads
[contributors-shield]: https://img.shields.io/badge/Contrbutors-10-green?style=flat&link=https%3A%2F%2Fgitlab.pg.innopolis.university%2Fteam20%2Fllm-rosalind
[issues-shield]: https://img.shields.io/badge/Issues-20-orange?style=flat
[issues-url]: https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/issues
[python]: https://img.shields.io/badge/Python-3.12-blue?style=flat
[python-url]: https://www.youtube.com/watch?v=xvFZjo5PgG0

[Next.js]: https://img.shields.io/badge/Next.JS-%23000000?style=for-the-badge&logo=next.js
[Next-url]: https://nextjs.org/
[Postgres]: https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white
[Postgres-url]: https://www.postgresql.org
[FastAPI]: https://img.shields.io/badge/FastAPI-%23FFFFFF?style=for-the-badge&logo=fastapi
[FastAPI-url]: https://fastapi.tiangolo.com
[Age]: https://img.shields.io/badge/Apache_AGE-%236d1fdd?style=for-the-badge&logo=apache
[Age-url]: https://age.apache.org
[Asyncpg]: https://img.shields.io/badge/AsyncPG-%234169E1?style=for-the-badge&logo=postgresql&logoColor=%23FFFFFF
[Asyncpg-url]: https://github.com/MagicStack/asyncpg
[TS]: https://img.shields.io/badge/TypeScript-%233178C6?style=for-the-badge&logo=typescript&logoColor=%23FFFFFF
[TS-url]: https://www.typescriptlang.org
[React]: https://img.shields.io/badge/React-%232361DAFB?style=for-the-badge&logo=react&logoColor=white
[React-url]: https://react.dev
[Transformers]: https://img.shields.io/badge/Transformers-%23FFD21E?style=for-the-badge&logo=huggingface&logoColor=%23000000
[Transformers-url]: https://huggingface.co/docs/transformers/index
[Langchain]: https://img.shields.io/badge/LangChain-%231C3C3C?style=for-the-badge&logo=langchain&logoColor=%23FFFFFF
[Langchain-url]: https://python.langchain.com/v0.2/docs/introduction/
[Nougat]: https://img.shields.io/badge/Nougat-%230467DF?style=for-the-badge&logo=meta&logoColor=%23FFFFFF
[Nougat-url]: https://github.com/facebookresearch/nougat
[Milvus]: https://img.shields.io/badge/Milvus-%2300A1EA?style=for-the-badge&logo=milvus&logoColor=%23FFFFFF
[Milvus-url]: https://milvus.io
[Pytorch]: https://img.shields.io/badge/PyTorch-%23EE4C2C?style=for-the-badge&logo=pytorch&logoColor=%23FFFFFF
[Pytorch-url]: https://pytorch.org
