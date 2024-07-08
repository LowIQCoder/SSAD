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
        <li><a href="#prerequisites">Run API</a></li>
        <li><a href="#installation">Run frontend</a></li>
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

![LLM Rosalind Screen Shot][product_screenshot]

LLM Rosalind is unique solution for studing and creating new courses. 

Here's why:
* Auto generations of courses from sources with use of LLM
* Graph representation of tasks
* Intuitive and beautiful interface

<p align="right"><a href="#readme-top">⬆️</a></p>

### Built With

* [![Next][next-shield]][[Next-url](https://nextjs.org)]]
* FastAPI
* Postgres

<p align="right"><a href="#readme-top">⬆️</a></p>

## Getting started
## Run API
Get repository
```sh
git clone https://gitlab.pg.innopolis.university/team20/llm-rosalind.git -b feature_refactor_backend
```
Setup environment
```sh
pip install -r .\requirements\requirements.txt
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
STATIC_FILES_UPLOAD_PATH=\path\to\folder
STATIC_FILES_DOWNLOAD_PATH=/files/upload
```
Run API
```sh
python3 -m src.backend.api
```
## Run frontend
Get repository
```sh
git clone https://gitlab.pg.innopolis.university/team20/llm-rosalind.git -b feature/main-page
```
Setup environment
```sh
npm install
```
Run frontend
```sh
npm run dev
```

<p align="right"><a href="#readme-top">⬆️</a></p>

<!-- ROADMAP -->
## Roadmap

<ul>
<li>1. Analysis
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

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.md` for more information.

<p align="right"><a href="#readme-top">⬆️</a></p>

<!-- CONTACT -->
## Contact

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

<!-- ACKNOWLEDGEMENTS -->
##   Acknowledgement

* [FastAPI](https://fastapi.tiangolo.com)
* [Best Chanel](https://www.youtube.com/watch?v=xvFZjo5PgG0)

<p align="right"><a href="#readme-top">⬆️</a></p>

<!-- MARKDOWN LINKS & IMAGES -->
[product_screenshot]: images/llmrosalind.png
[license-url]: LICENSE.md
[license-shield]: https://img.shields.io/badge/License-MIT-blue?style=flat
[contributors-url]: https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/graphs/feature_refactor_backend?ref_type=heads
[contributors-shield]: https://img.shields.io/badge/Contrbutors-10-green?style=flat&link=https%3A%2F%2Fgitlab.pg.innopolis.university%2Fteam20%2Fllm-rosalind
[issues-shield]: https://img.shields.io/badge/Issues-20-orange?style=flat
[issues-url]: https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/issues

[pg-shield]: https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white
[next-shield]: https://img.shields.io/badge/Next.js-000?logo=nextdotjs&logoColor=fff&style=for-the-badge
[fast-shield]: https://img.shields.io/badge/FastAPI-%23009688?style=flat-square&logo=fastapi&logoColor=%23FFFFFF&link=https%3A%2F%2Ffastapi.tiangolo.com
