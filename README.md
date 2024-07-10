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

<h3 align="center">LLM Rosalind</h3>

  <p align="center">
    A new way to learn!
    <br />
    <br />
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
        <li><a href="#run-ml">Run ML</a></li>
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

* [<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2BuPg6bX6J7FfnrkmbKPapCrIrVh_Jl_6WqkWWzTFbk6pgN8QbJ4l_2DFtYbnT_Giwxw&amp;amp;usqp=CAU" width="100"/>](https://pytorch.org/)
* [<img src="https://artwork.lfaidata.foundation/projects/milvus/horizontal/color/milvus-horizontal-color.png" width="100"/>](https://artwork.lfaidata.foundation/projects/milvus/horizontal/color/milvus-horizontal-color.png)
* [Nougat](https://nougat.ai/)
* [<img src="https://media.licdn.com/dms/image/D4E12AQHnLknj0EYfBA/article-cover_image-shrink_600_2000/0/1684267676484?e=2147483647&amp;v=beta&amp;t=PrMj5CmpRsqMecZwmySc3LSnQ9jkZNoer75YWJFzJBM" width="100"/>](https://langchain.com/)
* [<img src="https://huggingface.co/datasets/huggingface/brand-assets/resolve/main/hf-logo-with-title.png" width="100"/>](https://huggingface.co/transformers/)
* [<img src="https://cdn.icon-icons.com/icons2/2699/PNG/512/reactjs_logo_icon_170805.png" width="100"/>](https://reactjs.org/)
* [<img src="https://habrastorage.org/getpro/habr/upload_files/3f2/48c/8d9/3f248c8d93eb8ab55711d6e442e6c23e.png" width="100"/>](https://www.typescriptlang.org/)
* [<img src="https://pypi-camo.freetls.fastly.net/a28a1c21ce5cc58bb5ac7b75e2f2744349e5b4e8/68747470733a2f2f7261772e67697468756275736572636f6e74656e742e636f6d2f6c697465737461722d6f72672f6272616e64696e672f6d61696e2f6173736574732f4272616e64696e672532302d2532305356472532302d2532305472616e73706172656e742f6173796e6350472532302d25323042616e6e65722532302d253230496e6c696e652532302d2532304c696768742e7376672367682d6c696768742d6d6f64652d6f6e6c79" width="100"/>](https://github.com/MagicStack/asyncpg)
* [![Next][Next.js]][Next-url]
* [![FastAPI][FastAPI]][FastAPI-url]
* [![Postgres][Postgres]][Postgres-url]
* [![Age][Age]][Age-url]

<p align="right"><a href="#readme-top">⬆️</a></p>


## Run API

Get repository with latest version of API
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
## Run frontend
Get repository with latest version of frontend
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
# Contact

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

Project Link: https://gitlab.pg.innopolis.university/team20/llm-rosalind

<p align="right"><a href="#readme-top">⬆️</a></p>

<!-- MARKDOWN LINKS & IMAGES -->
[product_screenshot]: images/llmrosalind.png
[license-url]: LICENSE.md
[license-shield]: https://img.shields.io/badge/License-MIT-blue?style=flat
[contributors-url]: https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/graphs/feature_refactor_backend?ref_type=heads
[contributors-shield]: https://img.shields.io/badge/Contrbutors-10-green?style=flat&link=https%3A%2F%2Fgitlab.pg.innopolis.university%2Fteam20%2Fllm-rosalind
[issues-shield]: https://img.shields.io/badge/Issues-20-orange?style=flat
[issues-url]: https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/issues

[Next.js]: https://img.shields.io/badge/Next.JS-%23000000?style=for-the-badge&logo=next.js
[Next-url]: https://nextjs.org/
[Postgres]: https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white
[Postgres-url]: https://www.postgresql.org
[FastAPI]: https://img.shields.io/badge/FastAPI-%23FFFFFF?style=for-the-badge&logo=fastapi
[FastAPI-url]: https://fastapi.tiangolo.com
[Age]: https://img.shields.io/badge/Apache_AGE-%236d1fdd?style=for-the-badge&logo=apache
[Age-url]: https://age.apache.org
